package com.jpaexample.service

import com.jpaexample.dao.tera.BlockDAO
import com.jpaexample.dao.tera.BlockDependencyDAO
import com.jpaexample.dao.tera.BlockFileDAO
import com.jpaexample.dao.tera.LoadingFileDAO
import com.jpaexample.dao.tera.NoteMemoDAO
import com.jpaexample.dao.tera.ProjectExecutionDAO
import com.jpaexample.dao.tera.ProjectGroupDAO
import com.jpaexample.dao.tera.ProjectJpaDAO
import com.jpaexample.dao.tera.UnloadingFileDAO
import com.jpaexample.domain.code.BlockType
import com.jpaexample.domain.tera.BlockFlow
import com.jpaexample.domain.tera.Project
import com.jpaexample.domain.tera.ProjectExecution
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by smpark on 2017-01-13.
 */
@Service
class TeraService {
    @Autowired
    ProjectJpaDAO projectJpaDAO

    @Autowired
    ProjectGroupDAO projectGroupDAO

    @Autowired
    ProjectExecutionDAO projectExecutionDAO

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
    BlockDAO blockDAO



    List getChildProjectNodes(Integer prjGrpId) {
        List children = [];
        children.addAll(projectGroupDAO.findByprjGrpId(prjGrpId))
        children.addAll(projectJpaDAO.findByprjGrpId(prjGrpId))
        return children
    }


    BlockFlow getBlockFlow(Project project) {
        BlockFlow flow = new BlockFlow();
        flow.blocks = blockDAO.findByPrjIdAndPrjVerId(project)
        flow.blockDependencies = blockDependencyDAO.findByPrjIdAndPrjVerId(project)

        flow.blocks.each {
            if(it.blockType == BlockType.UNLOAD) {
                it.dataFiles = unloadingFileDAO.findByPrjIdAndPrjVerIdAndBlockId(it)
            } else if(it.blockType == BlockType.LOAD) {
                it.dataFiles = loadingFileDAO.findByPrjIdAndPrjVerIdAndBlockId(it)
            } else {
                it.dataFiles = blockFileDAO.findByPrjIdAndPrjVerIdAndBlockId(it)
            }
        }

        flow.noteMemos = noteMemoDAO.findByPrjIdAndPrjVerId(project)
        flow.projectExecutions = projectExecutionDAO.findByPrjIdAndPrjVerId(project)
        return flow
    }


    List<ProjectExecution> getProjectExecutions(Project project) {
        return projectExecutionDAO.findByPrjIdAndPrjVerId(project)
    }

}
