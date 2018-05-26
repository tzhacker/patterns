import com.yrml.proxy.factory.ProxyFactory;
import com.yrml.proxy.proxy.ProxyStore;
import com.yrml.proxy.store.IStore;
import com.yrml.proxy.store.impl.TaoBao;

/**
 * @des
 * @author John Tan
 * @date 2018/5/22
 */
public class ProxyTest {

    public static void main(String[] args) {
        IStore target = new TaoBao();
        //对象的原始类型
        System.out.println(target.getClass());

        IStore proxy = (IStore) new ProxyFactory(target).getProxyInstance();
        //内存中动态代理生成的对象类型
        System.out.println(proxy.getClass());

        //指定具体需要代理的对象
        proxy.saleFood();

    }
}
