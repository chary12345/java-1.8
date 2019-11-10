package practice;

import java.util.ArrayList;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ResultQuarterly {
	public static void main(String[] args) {
		StudentPojo s1 = new StudentPojo(100, "mahesh", "Vikas", 890);
		StudentPojo s5 = new StudentPojo(106, "vikram", "Vikas", 800);
		StudentPojo s2 = new StudentPojo(109, "B Reddy", "Vikas", 963);
		StudentPojo s3 = new StudentPojo(108, "Sainath", "Vikas", 853);
		StudentPojo s4 = new StudentPojo(118, "Yalliah", "Vikas", 450);
		ArrayList<StudentPojo> l = new ArrayList<>();
		l.add(s1);
		l.add(s2);
		l.add(s5);
		l.add(s3);
		l.add(s4);
		System.out.println("topper list of FreeChaitanya ");
		Function<StudentPojo, StudentPojo> f = t -> {
			t.setCollege("Chaitanya Parayana");
			t.setMarks(t.getMarks() + 50);
			return t;
		};
		

		// l.stream().filter(s->s.getMarks()>850).forEach(x->System.out.println(x
		// +" A Grade"));
		Set<StudentPojo> c = l.stream().filter(t -> t.getMarks() > 850).map(f).collect(Collectors.toSet());
		for (StudentPojo s : c) {
			System.out.println(s + " grade- " + " " + "A");
		}
	}

}
