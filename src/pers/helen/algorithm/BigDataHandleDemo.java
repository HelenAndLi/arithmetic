package pers.helen.algorithm;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

/**
 * https://blog.csdn.net/Px01Ih8/article/details/125117597
 */
public class BigDataHandleDemo {

    public static void main(String[] args){
        //        try{
        //            FileWriter fw = new FileWriter("D://temp/bigdata.txt");
        //            var random = RandomGenerator.of("L32X64MixRandom");
        //            for(int i=0;i<35;i++){
        //                IntStream intStream = random.ints(100*1024*1024, 18, 71);
        //                StringBuilder sb = new StringBuilder();
        //                intStream.forEach(x->sb.append(x).append(','));
        //                fw.write(sb.toString());
        //            }
        //
        //        }catch(IOException e){
        //            e.printStackTrace();
        //        }
        Map<String, Integer> map = new HashMap<>();
        long timestamp = System.currentTimeMillis();
        try{
            File file = new File("D://temp/bigdata.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedInputStream stream = new BufferedInputStream(new FileInputStream(file));
            String str;
            //            while((str= br.readLine())!=null){
            int counts;
            byte[] b = new byte[75000000];
            int i = 0;
            while((counts = stream.read(b, i * 75000000, b.length)) != -1){
                str = new String(b, i * 75000000, counts);
                System.out.println("line:"+str);
                String[] sArr = str.split(",");
                for(String s : sArr){
                    if(map.containsKey(s)){
                        map.put(s, map.get(s) + 1);
                    }else{
                        map.put(s, 1);
                    }
                }
            }
            //            }
            for(Map.Entry<String, Integer> m : map.entrySet()){
                System.out.println("key:" + m.getKey() + ", value:" + m.getValue());
            }
            System.out.println((System.currentTimeMillis()-timestamp)/1000);

        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
