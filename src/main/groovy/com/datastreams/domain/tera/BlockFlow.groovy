package com.datastreams.domain.tera
/**
 * Created with IntelliJ IDEA.
 * User: jsungnam
 * Date: 15. 2. 9
 * Time: 오전 9:53
 * To change this template use File | Settings | File Templates.
 */
class BlockFlow {
    List<Block> blocks = []
    List<BlockDependency> blockDependencies = []
    List<NoteMemo> noteMemos = []
    List<ProjectExecution> projectExecutions = []
}
