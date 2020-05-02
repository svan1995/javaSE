package com.csf.reflect;

public class Demo3 {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        Class<Demo3> demo3Class = Demo3.class;
        ClassLoader classLoader = demo3Class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = Object.class.getClassLoader();
        System.out.println(classLoader1);

        //获取系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\charsets.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\deploy.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\ext\access-bridge-32.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\ext\cldrdata.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\ext\dnsns.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\ext\jaccess.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\ext\jfxrt.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\ext\localedata.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\ext\nashorn.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\ext\sunec.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\ext\sunjce_provider.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\ext\sunmscapi.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\ext\sunpkcs11.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\ext\zipfs.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\javaws.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\jce.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\jfr.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\jfxswt.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\jsse.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\management-agent.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\plugin.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\resources.jar;
        // C:\Program Files (x86)\Java\jdk1.8.0_202\jre\lib\rt.jar;
        // C:\Users\CSF\IdeaProjects\javaSE\out\production\javaSE;
        // D:\Program Files\JetBrains\IntelliJ IDEA 2019.3.2\lib\idea_rt.jar
    }
}
