package com.hotmail.ch.leon.web.form;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.LabelValueBean;
import com.hotmail.ch.leon.web.vo.FindBookTbl01DetailVO;

public class FindBookForm extends T01AbstractForm {

    private static final long serialVersionUID = 1L;

    /** 类型 */
    private String searchType = null;


    /** 种类 */
    private String bookType = null;


    /** 种类list */
    private List<LabelValueBean> bookType_list = null;


    /** 出版年份 */
    private String produceYear = null;


    /** 书名 */
    private String bookName = null;


    private List<FindBookTbl01DetailVO> findBookTbl01DetailVOList = null;


    @Override
    public void reset(ActionMapping mapping, HttpServletRequest request) {

        if (findBookTbl01DetailVOList != null) {
            for (FindBookTbl01DetailVO elm : findBookTbl01DetailVOList) {
                elm.setSelect(false);
            }
        }

        super.reset(mapping, request);
    }

    /** 类型 的取得 */
    public String getSearchType() {
        return searchType;
    }


    /** 类型 的赋值 */
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }


    /** 种类 的取得 */
    public String getBookType() {
        return bookType;
    }


    /** 种类 的赋值 */
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }


    /** 种类 list的取得 */
    public List<LabelValueBean> getBookType_list() {
        return bookType_list;
    }


    /** 种类 list的赋值 */
    public void setBookType_list(List<LabelValueBean> bookType_list) {
        this.bookType_list = bookType_list;
    }


    /** 出版年份 的取得 */
    public String getProduceYear() {
        return produceYear;
    }


    /** 出版年份 的赋值 */
    public void setProduceYear(String produceYear) {
        this.produceYear = produceYear;
    }


    /** 书名 的取得 */
    public String getBookName() {
        return bookName;
    }


    /** 书名 的赋值 */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public List<FindBookTbl01DetailVO> getFindBookTbl01DetailVOList() {
        return findBookTbl01DetailVOList;
    }


    public void setFindBookTbl01DetailVOList(List<FindBookTbl01DetailVO> findBookTbl01DetailVOList) {
        this.findBookTbl01DetailVOList = findBookTbl01DetailVOList;
    }

    @Override
    public String getClassName() {
        return "FindBookForm";
    }

}
