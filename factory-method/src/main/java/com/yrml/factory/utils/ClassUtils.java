package com.yrml.factory.utils;

import com.google.common.collect.Lists;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 *
 * @author created by John Tan on 2018/6/14
 */
@SuppressWarnings("all")
public class ClassUtils {

  /**
   * 通过给定的接口类返回该接口的所有实现类
   * @param clzz
   * @return
   */
  public static List<Class> getAllClassByInterface(Class clzz){

    //定义一个存放实现类的容器
    List<Class> returnClassList = Lists.newArrayList();
    //只处理接口类
    if(clzz.isInterface()){
      //获取当前接口类的包名
      String packageName = clzz.getPackage().getName();
      try {
        //获取当前包下以及子包下的所有类
        List<Class> allClass = getClasses(packageName);
        //判断是否是同一个接口
        for (int i = 0; i < allClass.size(); i++) {
          if(clzz.isAssignableFrom(allClass.get(i))){ //只处理属于同一个接口的类
            if(!clzz.equals(allClass.get(i))){ //排除本身
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

  /**
   * 通过包名获取包以及该包子包下的所有类
   * @param packageName
   * @return
   * @throws ClassNotFoundException
   * @throws IOException
   */
  private static List<Class> getClasses(String packageName) throws ClassNotFoundException,IOException{
    //获取当前线程的上下文类加载器
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    String path = packageName.replace(".", "/");
    //通过类加载器获取指定路径下的所有资源
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
        //如果满足（文件名不包含“.”）的条件，向下执行
        assert !file.getName().contains(".");
        classes.addAll(findClasses(file, packageName + "." + file.getName()));
      } else if (file.getName().endsWith(".class")) {
        classes.add(Class.forName(packageName + "." + file.getName().substring(0, file.getName().length() - 6)));
      }
    }
    return classes;
  }
}
