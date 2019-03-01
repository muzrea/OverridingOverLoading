import sun.plugin2.os.windows.OVERLAPPED;

/**
 * Created by 苏晓风 on 2019/3/1.
 */
public class Test {
    public static void main(String[] args){
        OverridingUsage man = new OverridingUsage();
        man.eat();
        OverridingSub children = new OverridingSub();
        children.eat();
        OverloadingUsage somebody = new OverloadingUsage();
        somebody.run();
        somebody.run("Molly");
    }
}
