package net.example.rsf.customer;
import net.example.domain.consumer.EchoService;
import net.example.domain.consumer.MessageService;
import net.example.domain.consumer.UserService;
import net.example.domain.domain.UserDO;
import net.hasor.core.AppContext;
import net.hasor.core.Hasor;
import net.hasor.rsf.RsfApiBinder;
import net.hasor.rsf.RsfModule;
import net.hasor.rsf.RsfResult;
import net.hasor.utils.json.JSON;

import java.util.List;
/**
 *
 * @version : 2014年9月12日
 * @author 赵永春(zyc@hasor.net)
 */
public class CustomerClient {
    public static void main(String[] args) throws Throwable {
        //Client
        AppContext clientContext = Hasor.createAppContext("customer-config.xml", new RsfModule() {
            public void loadModule(RsfApiBinder apiBinder) throws Throwable {
                apiBinder.bindType(EchoService.class).toProvider(apiBinder.converToProvider(//
                        apiBinder.rsfService(EchoService.class).register()//
                ));
                apiBinder.bindType(MessageService.class).toProvider(apiBinder.converToProvider(//
                        apiBinder.rsfService(MessageService.class).register()//
                ));
                apiBinder.bindType(UserService.class).toProvider(apiBinder.converToProvider(//
                        apiBinder.rsfService(UserService.class).register()//
                ));
            }
        });
        System.out.println("server start.");
        //
        //Client -> Server
        EchoService echoService = clientContext.getInstance(EchoService.class);
        for (int i = 0; i < 200; i++) {
            Thread.sleep(100);
            try {
                String res = echoService.sayHello("Hello Word");
                System.out.println(res);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        //
        MessageService messageService = clientContext.getInstance(MessageService.class);
        for (int i = 0; i < 200; i++) {
            try {
                RsfResult res = messageService.sayHello("Hello Word");//客户端会瞬间返回,服务端执行一个消息需要 500毫秒。
                System.out.println(res);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        //
        UserService userService = clientContext.getInstance(UserService.class);
        List<UserDO> userDOS = userService.queryUser();
        System.out.println(JSON.toString(userDOS));
    }
}