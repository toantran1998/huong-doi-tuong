
public class employee {
	String name;
	int age;
	String phone[];
	String email;

	void setData(String n, int a, String p[], String e) {
		name = n;
		age = a;
		phone = p;
		email = e;
	}

	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(email);
	}

	void ds() {

		for (String a : phone) {
			if (a.startsWith("097")) {
				System.out.println(" so dien thoai " + a + " cua " + name + " la so viettel ");
			}
			if (a.startsWith("094")) {
				System.out.println(" so dien thoai " + a + " cua " + name + " la so vinaphone");
			}
			if (a.startsWith("095")) {
				System.out.println(" so dien thoai " + a + " cua " + name + " la so mobiphone");
			}
		}
	}
}