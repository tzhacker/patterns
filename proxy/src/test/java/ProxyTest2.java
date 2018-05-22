import com.yrml.proxy.factory.ProxyFactory2;
import com.yrml.proxy.store.IStore;

/**
 * @author John Tan
 * @des
 * @date 2018/5/22
 */
public class ProxyTest2 {

    public static void main(String[] args) {

        IStore proxy =  ProxyFactory2.createProxy();
        System.out.println(proxy.getClass());
        proxy.saleBook();
    }
}
