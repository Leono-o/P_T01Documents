package com.hotmail.ch.leon.web.form;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.util.LabelValueBean;
import com.hotmail.ch.leon.web.vo.FindBookTbl01DetailVO;

public class FindBookForm extends T01AbstractForm {

    private static final long serialVersionUID = 1L;

    /** ���� */
    private String searchType = null;


    /** ���� */
    private String bookType = null;


    /** ����list */
    private List<LabelValueBean> bookType_list = null;


    /** ������� */
    private String produceYear = null;


    /** ���� */
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

    /** ���� ��ȡ�� */
    public String getSearchType() {
        return searchType;
    }


    /** ���� �ĸ�ֵ */
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }


    /** ���� ��ȡ�� */
    public String getBookType() {
        return bookType;
    }


    /** ���� �ĸ�ֵ */
    public void setBookType(String bookType) {
        this.bookType = bookType;
    }


    /** ���� list��ȡ�� */
    public List<LabelValueBean> getBookType_list() {
        return bookType_list;
    }


    /** ���� list�ĸ�ֵ */
    public void setBookType_list(List<LabelValueBean> bookType_list) {
        this.bookType_list = bookType_list;
    }


    /** ������� ��ȡ�� */
    public String getProduceYear() {
        return produceYear;
    }


    /** ������� �ĸ�ֵ */
    public void setProduceYear(String produceYear) {
        this.produceYear = produceYear;
    }


    /** ���� ��ȡ�� */
    public String getBookName() {
        return bookName;
    }


    /** ���� �ĸ�ֵ */
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
