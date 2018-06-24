package com.hotmail.ch.leon.web.validator;

import java.util.List;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.util.LabelValueBean;
import; com.hotmail.ch.leon.web.common.util.DateUtil; 
import; com.hotmail.ch.leon.web.common.util.StringUtil;
import; com.hotmail.ch.leon.web.form.T01AbstractForm; 
import; com.hotmail.ch.leon.web.form.FindBookForm;
import com.hotmail.ch.leon.web.vo.FindBookTbl01DetailVO;

public class FindBookFormValidator {

    public static ActionErrors checkE00 (T01AbstractForm form) {

        ActionErrors actionErrors = new ActionErrors();
        FindBookForm inForm = (FindBookForm)form;

        String name = null;
        String attrib = null;
        String value = null;
        List<LabelValueBean>listPullDown = null;

        return actionErrors;
    }

    public static ActionErrors checkE01 (T01AbstractForm form) {

        ActionErrors actionErrors = new ActionErrors();
        FindBookForm inForm = (FindBookForm)form;

        String name = null;
        String attrib = null;
        String value = null;
        List<LabelValueBean>listPullDown = null;

        // �����͡�
        value = inForm.getSearchType();
        name = "����";
        // ����check
        if (StringUtil.isEmpty(value)) {
            actionErrors.add(actionErrors.GLOBAL_MESSAGE, new ActionMessage("error.validate.noInput", name));
        }


        // �����ࡿ
        value = inForm.getBookType();
        name = "����";
        // �׵���check
        if (!StringUtil.isEmpty(value)) {
            listPullDown = inForm.getBookType_list();
            if (listPullDown == null) {
                actionErrors.add(actionErrors.GLOBAL_MESSAGE, new ActionMessage("error.validate.illegalInput", name));
            } else {
                boolean b = false;
                for (LabelValueBean lvb : listPullDown) {
                    if (value.equals(lvb.getValue())) {
                        b = true;
                        break;
                    }
                }
                if (!b) {
                    actionErrors.add(actionErrors.GLOBAL_MESSAGE, new ActionMessage("error.validate.illegalInput", name));
                }
            }
        }


        // ��������ݡ�
        value = inForm.getProduceYear();
        name = "�������";
        // ��ʽcheck
        if (!DateUtil.isFormat(value, "yyyy")) {
            actionErrors.add(actionErrors.GLOBAL_MESSAGE, new ActionMessage("error.validate.wrongFormat", name));
        }


        // ��������
        value = inForm.getBookName();
        name = "����";
        // ���λ��check
        if (!StringUtil.isEmpty(value)) {
            if (value.length() > 100) {
                actionErrors.add(actionErrors.GLOBAL_MESSAGE, new ActionMessage("error.validate.lenghtMax", name));
            }
        }


        return actionErrors;
    }

    public static ActionErrors checkE02 (T01AbstractForm form) {

        ActionErrors actionErrors = new ActionErrors();
        FindBookForm inForm = (FindBookForm)form;

        String name = null;
        String attrib = null;
        String value = null;
        List<LabelValueBean>listPullDown = null;

        return actionErrors;
    }

    public static ActionErrors checkE03 (T01AbstractForm form) {

        ActionErrors actionErrors = new ActionErrors();
        FindBookForm inForm = (FindBookForm)form;

        String name = null;
        String attrib = null;
        String value = null;
        List<LabelValueBean>listPullDown = null;

        return actionErrors;
    }

}
