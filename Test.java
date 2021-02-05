import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        //敏感词过滤实际上是:维护一个敏感词库，这里我用list模拟一个敏感词库
        List<String> list = new ArrayList<>();
        list.add("996");
        list.add("加班");
        list.add("没工资");
        SensitiveWordUtil.init(new HashSet<>(list));
        System.out.println("敏感词库："+list);
        String str = "996加班有工资";
        System.out.println("原文--->:" + str);
        System.out.println("替换后--->:" + SensitiveWordUtil.replaceSensitiveWord(str, 2));
    }
}
