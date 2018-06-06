import java.io.*;

public class TestFile {
    public static void main(String[] args) throws IOException {

        // 写数据到文件
//
//        String hello = new String("Hello World");
//        byte[] bytes=hello.getBytes();
//        File file=new File("Test.java");
//        OutputStream os= null;
//        try {
//            os = new FileOutputStream(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        os.write(bytes);
//        os.close();
//        File file= new File("d:/Test.java");
//        byte[] bytes=new byte[(int)file.length()];
//        InputStream is= new FileInputStream(file);
//        int size=is.read(bytes);
//        System.out.println("大小"+size+"内容"+ new String(bytes));
//        is.close();
        //System.out.println(1);


        /**
         * left=0 right=11 sec=0
         *
         * 1.sec=0,area=0,left=1
         * 2.sec=1,area=0,right=10,left=1;
         * 3.sec=2,area=1,right=10,left=2;
         * 4.sec=2.area=3.right=10,left=3;
         * 5.sec=2,area=
         * */



                // for(int i=0;i<height.length()-2;i++){

                // }
                int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
                int secHight = 0; //当前最大高度（左右最大）
                int left = 0;
                int right = height.length-1;
                int area = 0;
                while (left < right){
                    //找到左右两边小的一边
                    //求当前最小值和当前最大值的差
                    if (height[left] <height[right]){
                        secHight = Math.max(height[left], secHight);
                        area += secHight-height[left];//计算当前格的能装雨水的容量
                        left++;
                        System.out.println("sec="+secHight+"  area="+area+"   left="+left+"   right="+right);
                    } else {
                        secHight = Math.max(height[right], secHight);
                        area += secHight-height[right];
                        right--;
                        System.out.println("sec="+secHight+"  area="+area+"   left="+left+"   right="+right);
                    }
                }



    }
}
