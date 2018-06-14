package com.yrml.factory.utils;

import com.google.common.collect.Lists;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author created by John Tan on 2018/6/14
 */
@SuppressWarnings("all")
public class ClassUtils {

  public static List<Class> getAllClassByInterface(Class clzz){

    List<Class> returnClassList = Lists.newArrayList();
    if(clzz.isInterface()){
      String packageName = clzz.getPackage().getName();
      try {
        List<Class> allClass = getClasses(packageName);
        for (int i = 0; i < allClass.size(); i++) {
          if(clzz.isAssignableFrom(allClass.get(i))){
            if(!clzz.equals(allClass.get(i))){
              returnClassList.add(allClass.get(i));
            }
          }
        }
      } catch (ClassNotFoundException e) {
        System.out.println("ClassNotFoundException:" + e);
      } catch (IOException e) {
        System.out.println("IOException:" + e);
      }
    }
    return returnClassList;
  }

  private static List<Class> getClasses(String packageName) throws ClassNotFoundException,IOException{
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    String path = packageName.replace(".", "/");
    Enumeration<URL> resources = classLoader.getResources(path);
    List<File> dirs = Lists.newArrayList();
    while (resources.hasMoreElements()){
      URL resource = resources.nextElement();
      dirs.add(new File(resource.getFile()));
    }
    ArrayList<Class> classes = Lists.newArrayList();
    for (File directory : dirs){
      classes.addAll(findClasses(directory, packageName));
    }
    return classes;
  }

  private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException{
    List<Class> classes = Lists.newArrayList();
    if(!directory.exists()){
      return classes;
    }
    File[] files = directory.listFiles();
    for (File file : files){
      if(file.isDirectory()){
        assert !file.getName().contains(".");
        classes.addAll(findClasses(file, packageName + "." + file.getName()));
      } else if (file.getName().endsWith(".class")) {
        classes.add(Class.forName(packageName + "." + file.getName().substring(0, file.getName().length() - 6)));
      }
    }
    return classes;
  }
}
