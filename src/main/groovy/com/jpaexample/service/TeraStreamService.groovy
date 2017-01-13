package com.jpaexample.service
/**
 * Created by smpark on 2017-01-13.
 */
//@Service
//class TeraStreamService {
//    @Autowired
//    ProjectJpaDAO projectJpaDAO
//
//    @Autowired
//    ProjectGroupDAO projectGroupDAO
//
//    @Autowired
//    ProjectExecutionDAO projectExecutionDAO
//
//    @Autowired
//    BlockDependencyDAO blockDependencyDAO
//
//    @Autowired
//    BlockFileDAO blockFileDAO
//
//    @Autowired
//    NoteMemoDAO noteMemoDAO
//
//    @Autowired
//    UnloadingFileDAO unloadingFileDAO
//
//    @Autowired
//    LoadingFileDAO loadingFileDAO
//
//
//    @Override
//    List getChildProjectNodes(Integer prjGrpId) {
//        List children = [];
//        children.addAll(projectGroupDAO.findByprjGrpId(prjGrpId))
//        children.addAll(projectJpaDAO.findByprjGrpId(prjGrpId))
////        children.addAll(dao.getChildProjectGroups(prjGrpId))
////        children.addAll(dao.getChildProjects(prjGrpId))
//        return children
//    }
//
//    @Override
//    BlockFlow getBlockFlow(Project project) {
//        BlockFlow flow = new BlockFlow();
//        flow.blockDependencies = dao.getBlockDependencies(project)
//        flow.blocks = dao.getBlocks(project)
//
//        flow.blocks.each {
//            if(it.blockType == BlockType.UNLOAD) {
//                it.dataFiles = dao.getUnloadingFiles(it)
//            } else if(it.blockType == BlockType.LOAD) {
//                it.dataFiles = dao.getLoadingFiles(it)
//            } else {
//                it.dataFiles = dao.getBlockFiles(it)
//            }
//        }
//
//        flow.noteMemos = dao.getNoteMemos(project)
//        flow.projectExecutions = dao.getProjectExecutions(project)
//        return flow
//    }
//
//    @Override
//    List<ProjectExecution> getProjectExecutions(Project project) {
//        return dao.getProjectExecutions(project)
//    }
//
//}
class TeraStreamService {

}
