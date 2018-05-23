import com.yrml.proxy.cglib.ProxyCglib;
import com.yrml.proxy.store.impl.BianLiDian;

/**
 * @author John Tan
 * @des
 * @date 2018/5/22
 */
public class ProxyTest3 {

    public static void main(String[] args) {

        BianLiDian bianLiDian = new BianLiDian();
        System.out.println(bianLiDian.getClass());

        BianLiDian proxy = (BianLiDian) new ProxyCglib(bianLiDian).getProxyInstance();
        proxy.sale();
    }
}
