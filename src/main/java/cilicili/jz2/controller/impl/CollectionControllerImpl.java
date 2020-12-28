package cilicili.jz2.controller.impl;

import cilicili.jz2.controller.ICollectionController;
import cilicili.jz2.service.impl.CollectionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/collection")
public class CollectionControllerImpl implements ICollectionController {
    private final CollectionServiceImpl collectionService;

    @Autowired
    public CollectionControllerImpl(CollectionServiceImpl collectionService) {
        this.collectionService = collectionService;
    }
}
