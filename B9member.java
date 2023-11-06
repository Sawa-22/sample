
public class B9member {
	public int year;
	public String league;
	public int position;
	public String name;
	public String team;
	
	System.out.println(); // DBから各年のベストナインを引っ張ってきて出力させる
	System.out.println( + "年" + "リーグ" + "のベストナイン");
}
//データベースに接続するメソッド↓
//private static String getSqlite3Path(){
//    return System.getProperty("user.dir") + File.separator + "sql" + File.separator + "juku.sqlite3";
//}
