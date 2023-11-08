
public class B9member {
	public static void main(String[]args) {
		int[] id = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //　ポジションと被る
		int[] years = {2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023};
		String[] league = {"セントラル", "パシフィック"};
		String[] position = {"P", "C", "1B", "2B", "3B", "SS", "OF1", "OF2", "OF3", "DH"}; // LF, CF, RF
		String[] name = {"吉見一起", "null", "栗原健太", "平野恵一", "宮本慎也", "鳥谷敬", "マットマートン", "青木宣親", "長野久義"}; //DB管理
		String[] team = {"Giants", "Tigers", "Dragons", "Swallows", "Carp", "BayStars", "Hawks", "Lions", "Baffaloes", "Fighters", "Marines", "Eagles"};
	
		public static void main(String []args) {
		
			// System.out.print(year + "年" + league "リーグ" + "ベストナイン");
			// System.out.println(); // DBから各年のベストナインを引っ張ってきて出力させる、DBを作るためのコマンドラインをあげる？？
		}

		//データベースに接続するメソッド
		private static String getSqlite3Path(){
    			return System.getProperty("user.dir") + File.separator + "sql" + File.separator + "juku.sqlite3";
		}
	}
}
