public class StudentNoteSystem {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkOralExamNote(80, 40, 25);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkOralExamNote(90, 60, 80);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,80,30);
        s3.addBulkOralExamNote(60, 100, 50);
        s3.isPass();

    }
}


class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int oralExamNote;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralExamNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}

class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    int average;
    boolean isPass;
    int averageFizik;
	int averageMat;
	int averageKimya;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }
    public void addBulkOralExamNote(int matOralExam, int fizikOralExam, int kimyaOralExam){
        if (matOralExam >= 0 && matOralExam <= 100) {
            this.mat.oralExamNote = matOralExam;
        }

        if (fizikOralExam >= 0 && fizikOralExam <= 100) {
            this.fizik.oralExamNote = fizikOralExam;
        }

        if (kimyaOralExam >= 0 && kimyaOralExam <= 100) {
            this.kimya.oralExamNote = kimyaOralExam;
        }
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("GENEL ORTALAMA \t: " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAverage() {
        this.averageFizik = ((this.fizik.note * 80) + (this.fizik.oralExamNote * 20)) / 100;
        this.averageMat = ((this.mat.note * 80) + (this.mat.oralExamNote * 20)) / 100;
        this.averageKimya = ((this.kimya.note * 80) + (this.kimya.oralExamNote * 20)) / 100;
        this.average = (averageFizik + averageKimya + averageMat) / 3;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci\t\t: " + this.name);
        System.out.println("Matematik\t: Sözlü Notu : " + this.mat.oralExamNote   + "\t Yazılı Sınav Notu : " + this.mat.note + " \tOrtalama : " + this.averageMat);
        System.out.println("Fizik\t\t: Sözlü Notu : " + this.fizik.oralExamNote + "\t Yazılı Sınav Notu : " + this.fizik.note + " \tOrtalama : " + this.averageFizik);
        System.out.println("Kimya\t\t: Sözlü Notu : " + this.kimya.oralExamNote + "\t Yazılı Sınav Notu : " + this.kimya.note + " \tOrtalama : " + this.averageKimya);
    }

}

class Teacher {
	String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

}