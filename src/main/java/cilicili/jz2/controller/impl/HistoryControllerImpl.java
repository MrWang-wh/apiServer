package cilicili.jz2.controller.impl;

import cilicili.jz2.controller.IHistoryController;
import cilicili.jz2.pojo.History;
import cilicili.jz2.service.impl.HistoryServiceImpl;
import cilicili.jz2.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/history")
public class HistoryControllerImpl implements IHistoryController {
    private final HistoryServiceImpl historyService;

    @Autowired
    public HistoryControllerImpl(HistoryServiceImpl historyService) {
        this.historyService = historyService;
    }
}
