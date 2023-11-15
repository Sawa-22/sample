import java.util.Scanner;

public class mybestnine {
	public static void main(String[] args) {
	System.out.println("シーズン/リーグを入力してください > ");
	
	Scanner scan = new Scanner(System.in);
	// 2015～2022の中から知りたいシーズンを選択できるようにする。
	int year = scan.nextLine();
	// セ・パの2つなので、選択できるようにする。
	String league = scan.nextLine();
	
	
	System.out.println(year + "年" + league + "リーグ" + "のベストナイン");
	scan.close();

		int year = 2022;
		if (year == 2022) { // "セ" or "パ"
			
		System.out.println("P " + "青柳晃洋" + "T ");
		System.out.println("C " + "木下拓哉" + "D ");
		System.out.println("1B" + "J.オスナ" + "Ys");
		System.out.println("2B" + "牧秀悟　" + "DB");
		System.out.println("3B" + "村上宗隆" + "Ys");
		System.out.println("SS" + "中野拓夢" + "T ");
		System.out.println("LF" + "佐野恵太" + "DB");
		System.out.println("CF" + "近本光司" + "T ");
		System.out.println("RF" + "岡林勇希" + "D ");
		}

		{
		System.out.println("C " + "該当者なし" + "該当球団なし");
		System.out.println("1B" + "● ● ● ● " + "L ");
		System.out.println("2B" + "浅村栄斗" + "E ");
		System.out.println("3B" + "宗佑磨　" + "Bs");
		System.out.println("SS" + "今宮健太" + "H ");
		System.out.println("LF" + "島内宏明" + "E ");
		System.out.println("CF" + "松本剛　" + "F ");
		System.out.println("RF" + "柳田悠岐" + "H ");
		System.out.println("DH" + "吉田正尚" + "Bs");
		}

		//配列で管理した方が楽
		//String position;
        	//String name;
		//String team;
		//float Ave.
		//byte HR
		//short RBI
		//byte SB
		
}
