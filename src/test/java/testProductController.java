import com.lizongxi.pojo.TProduct;
import com.lizongxi.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author ZONGXI LI
 * @version 1.0.0
 * @ClassName testProductController.java
 * @Description TODO
 * @createTime 2022年07月01日 22:12:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testProductController {
    @Autowired
    private IProductService productService;
    @Test
    public void getList(){
        List<TProduct> products = productService.getProducts();
        System.out.println(products.toString());
    }
}
