package controller;

import dao.StatementDAO;
import model.StatementEntity;
import org.icefaces.ace.event.SelectEvent;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.event.AjaxBehaviorEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by WEO on 9/19/16.
 */

@ManagedBean
@ViewScoped
public class StatementDataTableBean implements Serializable {

    private static final long serialVersionUID = -7718234972982720979L;

    Logger logger = Logger.getLogger(StatementDataTableBean.class.getName());
    private List<StatementEntity> statementEntityList = new ArrayList();
    private StatementDAO statementDAO = new StatementDAO();
    private StatementEntity statementDetails;
    private boolean detailsHidden = true;

    @PostConstruct
    public void init() {
        statementEntityList.addAll(statementDAO.getStatement());
    }

    public void save() {
        statementDAO.saveStatement(statementDetails);
        statementEntityList = statementDAO.getStatement();
    }

    public void selectionListener(SelectEvent event) {
        StatementEntity temp = (StatementEntity) event.getObject();
        setStatementDetails(temp);
        detailsHidden = false;
    }

    public void changeListener(AjaxBehaviorEvent event) {
        Object source = event.getSource();
        if (source != null && source.getClass().equals(HtmlInputText.class)) {
            logger.info("change ---> THE FIELD " + ((HtmlInputText) source).getId());
        }
    }

    public List<StatementEntity> getStatementEntityList() {
        return statementEntityList;
    }

    public void setStatementEntityList(List<StatementEntity> statementEntityList) {
        this.statementEntityList = statementEntityList;
    }

    public StatementDAO getStatementDAO() {
        return statementDAO;
    }

    public void setStatementDAO(StatementDAO statementDAO) {
        this.statementDAO = statementDAO;
    }

    public StatementEntity getStatementDetails() {
        return statementDetails;
    }

    public void setStatementDetails(StatementEntity statementDetails) {
        this.statementDetails = statementDetails;
    }

    public boolean isDetailsHidden() {
        return detailsHidden;
    }

    public void setDetailsHidden(boolean detailsHiddem) {
        this.detailsHidden = detailsHiddem;
    }
}
