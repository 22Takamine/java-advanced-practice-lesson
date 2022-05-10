public class Japanese extends Human {
	
	/**
     * コンストラクタ(引数なし)
     */
    public Japanese() {
        // 初期値をセット
        super();
        language = "日本語";
    }

    /**
     * コンストラクタ (受け取った引数を元に初期値をセット)
     */
    public Japanese(String name, String language) {
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
        String msg = "出身地:日本";

        // 作成した文字列を返却
        return msg;
    }
}