package class01;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void Login(){
        System.out.println(6/0);
    }

    @Test(dependsOnMethods = {"Login"})
    public void DashBoardVerfication(){
        System.out.println("after login i am verifying dashboard");
    }
}
