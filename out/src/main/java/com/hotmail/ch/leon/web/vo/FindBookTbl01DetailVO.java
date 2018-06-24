package com.hotmail.ch.leon.web.vo;


public class FindBookTbl01DetailVO extends T01AbstractVO {

    /** 选择 */
    private boolean select = false;


    /** 书号 */
    private String bookID = null;


    /** 种类 */
    private String bookType = null;


    /** 书名 */
    private String bookName = null;


    /** 年份 */
    private String produceYear = null;


    /** 选择 的取得 */
    public boolean isSelect() {
        return select;
    }

    /** 选择 的赋值 */
    public void setSelect(boolean select) {
        this.select = select;
    }

    /** 书号 的取得 */
    public String getBookID() {
        return bookID;
    }

    /** 书号 的赋值 */
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    /** 种类 的取得 */
    public String getBookType() {
        return bookType;
    }

    /** 种类 的赋值 */
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    /** 书名 的取得 */
    public String getBookName() {
        return bookName;
    }

    /** 书名 的赋值 */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /** 年份 的取得 */
    public String getProduceYear() {
        return produceYear;
    }

    /** 年份 的赋值 */
    public void setProduceYear(String produceYear) {
        this.produceYear = produceYear;
    }


}
