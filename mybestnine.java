import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class mybestnine {
	
	int year;
	String league;
	String position;
	String name;
	String team;
	
	// System.out.println(year + "年" + league + "リーグ" + "のベストナイン");

	// コンストラクタ
	public mybestnine(int year, String league, String position, String name, String team) {
		this.year = year;
		this.league = league;
		this.position = position;
		this.name = name;
		this.team = team;
	}
	
	public int getYear() { // yearをgetするメソッド（それぞれ書く）
		return year;
	}
	
	public String getLeague() {
		return league;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTeam() {
		return team;
	}
	
	// DB接続メソッド
	public static String getSqlite3Path(){
		    return System.getProperty("user.dir") + File.separator + "sql" + File.separator + "juku.sqlite3";
	}

	
	// テーブル取得メソッド
	public static List<mybestnine> fetchmyb9() {
		List<mybestnine> rows = new ArrayList<mybestnine>();
		
		try {
			// SQlに接続
			Connection connection = DriveManager.getConnection("jdbc:sqlite:" + getSqlite3Path());
			// SQL文をDBに送るためのStatementオブジェクトを生成
			Statement createStatement = null; //connection.createStatement(); // 必要なクラス（パッケージをインポートしていないため…
			// ステートメントを作成したらSQL文を作成しDBに問い合わせを行う
			ResultSet resultSet = createStatement.executeQuery("select * from myb9;");
			
			while (resultSet.next()) {
				// int year = resultSet.getInt("year");
				// String name = resultSet.getString("league");
				String position = resultSet.getString("position");
				String name = resultSet.getString("name");
				String team = resultSet.getString("team");
				
				mybestnine row = new mybestnine(0, null, null, null, null); // ??
				rows.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rows;
	}
}
