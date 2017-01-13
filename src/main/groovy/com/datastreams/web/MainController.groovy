package com.datastreams.web

import com.datastreams.dao.ContentRepository
import com.datastreams.dao.NonContentRepository
import com.datastreams.dao.TodoRepository
import com.datastreams.dao.tera.BlockDAO
import com.datastreams.dao.tera.BlockDependencyDAO
import com.datastreams.dao.tera.BlockExecutionDAO
import com.datastreams.dao.tera.BlockFileDAO
import com.datastreams.dao.tera.LinePointDAO
import com.datastreams.dao.tera.LoadingFileDAO
import com.datastreams.dao.tera.NoteMemoDAO
import com.datastreams.dao.tera.ProjectExecutionDAO
import com.datastreams.dao.tera.ProjectGroupDAO
import com.datastreams.dao.tera.ProjectJpaDAO
import com.datastreams.dao.tera.UnloadingFileDAO
import com.datastreams.domain.Content
import com.datastreams.domain.NonContent
import com.datastreams.domain.Todo
import com.datastreams.domain.tera.BlockFile
import com.datastreams.domain.tera.LoadingFile
import com.datastreams.domain.tera.NoteMemo
import com.datastreams.domain.tera.UnloadingFile
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by smpark on 2017-01-13.
 */
@RestController
class MainController{

//    @Autowired
//    TodoService todoService
//
//    @Autowired
//    ContentRepository contentDAO
//
//    @Autowired
//    NonContentRepository nonContentDAO
//
//    @Autowired
//    TodoRepository todoDAO

    @Autowired
    ProjectJpaDAO projectJpaDAO

    @Autowired
    ProjectGroupDAO projectGroupDAO

    @Autowired
    ProjectExecutionDAO projectExecutionDAO

    @Autowired
    BlockDAO blockDAO

    @Autowired
    BlockDependencyDAO blockDependencyDAO

    @Autowired
    BlockFileDAO blockFileDAO

    @Autowired
    NoteMemoDAO noteMemoDAO

    @Autowired
    UnloadingFileDAO unloadingFileDAO

    @Autowired
    LoadingFileDAO loadingFileDAO

    @Autowired
    BlockExecutionDAO blockExecutionDAO

    @Autowired
    LinePointDAO linePointDAO

    @RequestMapping("loading")
    List<LoadingFile> getLoading(){
        return loadingFileDAO.findAll()
    }

    @RequestMapping("unloading")
    List<UnloadingFile> getUnloading(){
        return unloadingFileDAO.findAll()
    }

    @RequestMapping("notememo")
    List<NoteMemo> getNoteMemo(){
        return noteMemoDAO.findAll()
    }

    @RequestMapping("block")
    List<BlockFile> getBlock(){
        return blockFileDAO.findAll()
    }

}
