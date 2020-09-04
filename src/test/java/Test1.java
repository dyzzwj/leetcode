import org.junit.Test;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Test1.java
 * @Description TODO
 * @createTime 2020年08月25日 11:12:00
 */
public class Test1 {

    @Test
    public void test1(){
        /**
         * 四舍五入 +0.5 向下取整
         */
        System.out.println(Math.round(-11.5));
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(11.1));

        System.out.println(Math.round(-11.6));
    }

    @Test
    public void test2(){


    }
}
