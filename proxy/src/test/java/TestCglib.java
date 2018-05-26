import com.yrml.proxy.cglib.ProxyCglib;
import com.yrml.proxy.filter.TargetMethodCallbackFilter;
import com.yrml.proxy.filter.TargetResultFixed;
import com.yrml.proxy.store.impl.BianLiDian;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

/**
 * @author zhaohui.tan
 */
public class TestCglib {

    public static void main(String[] args) {

        BianLiDian bianLiDian = new BianLiDian();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(bianLiDian.getClass());

        CallbackFilter callbackFilter = new TargetMethodCallbackFilter();
        Callback noopCb = NoOp.INSTANCE;
        Callback callback1 = new ProxyCglib(bianLiDian);
        Callback fixedValue = new TargetResultFixed();
        Callback[] cbarray = new Callback[]{callback1, noopCb, fixedValue};

        enhancer.setCallbacks(cbarray);
        enhancer.setCallbackFilter(callbackFilter);

        BianLiDian proxy = (BianLiDian) enhancer.create();
        System.out.println(proxy);
        System.out.println(proxy.show1());
        System.out.println(proxy.show2());
        System.out.println(proxy.show3());

    }
}
