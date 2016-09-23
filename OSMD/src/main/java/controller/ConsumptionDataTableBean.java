package controller;

import dao.ConsumptionDAO;
import model.ConsumptionEntity;
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

@ManagedBean(name = "consumptionDataTableBean")
@ViewScoped
public class ConsumptionDataTableBean extends DataTableSearchBean implements Serializable {

    private static final long serialVersionUID = 3064725258383686472L;

    Logger logger = Logger.getLogger(ServiceDataTableBean.class.getName());
    private List<ConsumptionEntity> consumptionEntityList = new ArrayList();
    private ConsumptionDAO consumptionDAO = new ConsumptionDAO();
    private ConsumptionEntity consumptionDetails;
    private boolean detailsHidden = true;

    @PostConstruct
    public void init() {
        consumptionEntityList.addAll(consumptionDAO.getConsumptions());
    }

    public void save() {
        consumptionDAO.saveConsumption(getConsumptionDetails());
        consumptionEntityList = consumptionDAO.getConsumptions();
    }

    public void selectionListener(SelectEvent event) {
        ConsumptionEntity temp = (ConsumptionEntity) event.getObject();
        setConsumptionDetails(temp);
        detailsHidden = false;
    }

    public void changeListener(AjaxBehaviorEvent event) {
        Object source = event.getSource();
        if (source != null && source.getClass().equals(HtmlInputText.class)) {
            logger.info("change ---> THE FIELD " + ((HtmlInputText) source).getId());
        }
    }


    public List<ConsumptionEntity> getConsumptionEntityList() {
        return consumptionEntityList;
    }

    public void setConsumptionEntityList(List<ConsumptionEntity> consumptionEntityList) {
        this.consumptionEntityList = consumptionEntityList;
    }

    public ConsumptionDAO getConsumptionDAO() {
        return consumptionDAO;
    }

    public void setConsumptionDAO(ConsumptionDAO consumptionDAO) {
        this.consumptionDAO = consumptionDAO;
    }

    public ConsumptionEntity getConsumptionDetails() {
        return consumptionDetails;
    }

    public void setConsumptionDetails(ConsumptionEntity consumptionDetails) {
        this.consumptionDetails = consumptionDetails;
    }

    public boolean isDetailsHidden() {
        return detailsHidden;
    }

    public void setDetailsHidden(boolean detailsHidden) {
        this.detailsHidden = detailsHidden;
    }
}
