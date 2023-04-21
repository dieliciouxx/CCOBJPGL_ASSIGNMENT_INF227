public class Exam {
        static boolean iwillReview = true;
        static boolean iwillNotFail = true;

        public static void main(String[] args) throws Exception {

        Exam myReview = new Exam();

            //precondition
        assert iwillReview == true: "I passed the exam!";

        myReview.iwillReview();
         System.out.println(iwillReview);

            //postcondition
        assert iwillNotFail == true: "I failed!!";

    }
        
    void iwillReview() {
        iwillNotFail = false;
    }

}
