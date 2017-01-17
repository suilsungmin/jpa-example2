package com.jpaexample.web

import com.jpaexample.dao.TodoRepository
import com.jpaexample.dao.tera.BlockDAO
import com.jpaexample.dao.tera.BlockDependencyDAO
import com.jpaexample.dao.tera.BlockExecutionDAO
import com.jpaexample.dao.tera.BlockFileDAO
import com.jpaexample.dao.tera.LinePointDAO
import com.jpaexample.dao.tera.LoadingFileDAO
import com.jpaexample.dao.tera.NoteMemoDAO
import com.jpaexample.dao.tera.ProjectExecutionDAO
import com.jpaexample.dao.tera.ProjectGroupDAO
import com.jpaexample.dao.tera.ProjectJpaDAO
import com.jpaexample.dao.tera.UnloadingFileDAO
import com.jpaexample.domain.Content
import com.jpaexample.domain.NonContent
import com.jpaexample.domain.Todo
import com.jpaexample.domain.tera.BlockFile
import com.jpaexample.domain.tera.LoadingFile
import com.jpaexample.domain.tera.NoteMemo
import com.jpaexample.domain.tera.UnloadingFile
import com.jpaexample.service.TeraService
import org.springframework.beans.factory.InitializingBean
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by smpark on 2017-01-13.
 */
@RestController
class MainController implements InitializingBean{

//    @Autowired
//    TodoService todoService
//
//    @Autowired
//    ContentRepository contentDAO
//
//    @Autowired
//    NonContentRepository nonContentDAO

    @Autowired
    TodoRepository todoDAO

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

    @Autowired
    TeraService teraStreamService

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
    @RequestMapping("prjExe")
    List<BlockFile> getPrjExe(){
        return projectExecutionDAO.findAll()
    }
    @RequestMapping("todo")
    List<Todo> getTodo(){
        return todoDAO.findAll()
    }

    @Override
    void afterPropertiesSet() throws Exception {
        Todo todo1 = new Todo()
        Content content = new Content(content: "content")
        todo1.setInfo(content)
        Todo todo2 = new Todo()
        NonContent nonContent = new NonContent(nonContent: "nonContent")
        todo2.setInfo(nonContent)
        todoDAO.save(todo1)
        todoDAO.save(todo2)
    }
}
