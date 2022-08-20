import com.minami.config.SpringConfig;
import com.minami.domain.Account;
import com.minami.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        Account account = accountService.selectById(2);
        System.out.println(account);
    }
}
