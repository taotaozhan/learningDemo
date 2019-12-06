package com.example.ehcachecache;




import com.example.ehcachecache.entity.Student;
import com.example.ehcachecache.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = EhcachecacheApplication.class)
public class  EhcachecacheApplicationTest {

	@Autowired
	private StudentService studentService;


	@Test
    public void test1() throws Exception {
        Student student1 = this.studentService.queryStudentBySno("001");
        System.out.println("学号" + student1.getSno() + "的学生姓名为：" + student1.getsName());

        Student student2 = this.studentService.queryStudentBySno("001");
        System.out.println("学号" + student2.getSno() + "的学生姓名为：" + student2.getsName());
    }

	@Test
	public void test2() throws Exception {

		Student student1 = this.studentService.queryStudentBySno("001");
		System.out.println("学号" + student1.getSno() + "的学生姓名为：" + student1.getsName());

		student1.setsName("康康");
		this.studentService.update(student1);

		Student student2 = this.studentService.queryStudentBySno("001");
		System.out.println("学号" + student2.getSno() + "的学生姓名为：" + student2.getsName());
	}
}
