package demo4_api_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrayssort {
    public static void main(String[] args) {
        //Aarry的sort对有值的数组默认升序排序
        Integer[] arr ={24,543,5,7,85,5};
        //降序 自定义比较器对象 只支持引用类型
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                if (o1>02){
//                    return 1;
//                }else if (o1<o2){
//                    return -1;
//                }
//                return 0;
                //默认升序
                return o2-o1;
                //降序
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println("------------");
        Student[] students = new Student[3];
        students[0] = new Student("jia",10,100);
        students[1] = new Student("wen",11,120);
        students[2] = new Student("jie",12,140);

        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //指定比较规则

                //return o1.getAge()-o2.getAge();
                //return o1.getHeight()-o2.getHeight();
                return Double.compare(o1.getHeight(),o2.getHeight());
                //浮点型可以这么写
            }
        });
    }
}
