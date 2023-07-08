package OgrenciBilgiSistemiOdev;

public class RunPlay {
    public static void main(String[] args) {
        //Öğrenci Not Sistemi
//Course Sınıfı Özellikleri :
//    Nitelikler : name,code,prefix,note,Teacher
//    Metotlar : Course() , addTeacher() , printTeacher()
//Teacher Sınıfı Özellikleri :
//    Nitelikler : name,mpno,branch
//    Metotlar : Teacher()
//Student Sınıfı Özellikleri :
//    Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
//    Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
//Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
// Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
//Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
//Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
//Fizik Ortalaması : (90 * 0.20) + (60* 0.80);

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
        s1.addExamNote(50,20,40);
        s1.addQuiz(80,60,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addExamNote(100,50,40);
        s2.addQuiz(60,40,80);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addExamNote(50,20,40);
        s3.addQuiz(50,70,90);
        s3.isPass();

    }
}



