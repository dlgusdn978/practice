package week1;

public class Type {
    public static void main(String[] args) {

        System.out.println("=== 미션 1: 형변환을 통한 정확한 평균 구하기 ===");
        int mathScore = 85;
        int englishScore = 90;
        int scienceScore = 82;

        // [미션 1] 세 과목의 합을 구한 뒤, '소수점 이하 결과까지 정확하게' 평균을 소수로 출력하세요.
        // 정수끼리 나누면 소수점이 잘리므로 형변환(Casting)이 필요합니다.
        double average = (double) (mathScore+englishScore+scienceScore)/3; // 이 부분을 수정하세요.

        System.out.println("정확한 평균 점수: " + average); // 예상 결과: 85.66666666666667


        System.out.println("\n=== 미션 2: 강제 형변환과 데이터 손실 ===??");
        double pi = 3.141592;

        // [미션 2] 실수형 변수 pi를 정수형(int) 변수 intPi에 강제로 형변환하여 대입하고 출력하세요.
        int intPi = (int) pi; // 이 부분을 수정하세요.

        System.out.println("소수점이 잘린 PI 값: " + intPi); // 예상 결과: 3


        System.out.println("\n=== 미션 3: 기본형과 참조형의 값 복사 비교 ===???");
        // 기본형의 값 복사
        int originalX = 10;
        int copyX = originalX;
        copyX = 20; // 복사본을 변경
        System.out.println("originalX: " + originalX + ", copyX: " + copyX); // 출력: 10, 20 (원본 유지)

        // 참조형(배열)의 주소 복사
        int[] originalArray = {1, 2, 3};
        int[] copyArray = originalArray; // 주소값이 복사됨

        // [미션 3] copyArray의 0번째 인덱스 값을 99로 변경해 보세요.
        // 그 후 아래 프린트문에서 originalArray[0]의 값도 함께 바뀌는지 확인하고 이유를 주석으로 생각해보세요.
        // 여기에 코드를 작성하세요.
        copyArray[0] = 99;
        // copyArray는 originalArray의 주소 값을 가져오는 것으로, 둘 다 값 변경이 이루어짐
        System.out.println("originalArray[0]: " + originalArray[0] + ", copyArray[0]: " + copyArray[0]);


        System.out.println("\n=== 미션 4: 참조형의 특권, null과 NPE ===");
        String normalText = "안녕하세요";
        System.out.println("텍스트 길이: " + normalText.length()); // 정상 출력: 5

        // [미션 4] 아래 주석 처리된 코드는 실행 시 NullPointerException(NPE) 에러가 발생합니다.
        // 에러가 발생하지 않도록 if문을 사용하여 "null 체크 로직"을 추가해 안전하게 감싸주세요.
        String nullText = null;

        // (이 자리에 null 검사 if문을 작성하세요)
        if(nullText!=null)System.out.println("nullText의 길이: " + nullText.length());
        // (if문 작성 후 null이라면 "측정 불가(null)" 라고 출력되게 하세요)
    }
}
