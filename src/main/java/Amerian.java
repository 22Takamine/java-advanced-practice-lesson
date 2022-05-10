public class Amerian extends Human {
	
	/**
     * コンストラクタ(引数なし)
     */
    public Amerian() {
        // 初期値をセット
        super();
        language = "英語";
    }

    /**
     * コンストラクタ (受け取った引数を元に初期値をセット)
     */
    public Amerian(String name, String language) {
        // フィールドを初期化
        super(name,language);

        if (!Utility.isNullOrEmpty(name)) {
            this.name = name;
        }

        if (!Utility.isNullOrEmpty(language)) {
            this.language = language;
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	public String returnBirthPlaceInfo() {
        // 出身地用の文字列
        String msg = "出身地:アメリカ。" + "アメリカの公用語は「英語」です";

        // 作成した文字列を返却
        return msg;
    }
}