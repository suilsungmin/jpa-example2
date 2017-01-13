package com.datastreams.service

import com.datastreams.dao.TodoRepository
import com.datastreams.domain.Content
import com.datastreams.domain.Info
import com.datastreams.domain.NonContent
import com.datastreams.domain.Todo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by smpark on 2017-01-13.
 */
class TodoService {
//    @Autowired
//    private TodoRepository todoRepository
//
//    List<Todo> findAll() {
//        List<Todo> todos = todoRepository.findAll()
//        todos.each {
//            List<Info> infos = []
//            if(it.type == "content"){
//                infos.add(new Content(content: ["content1","content2"]))
//                it.setInfos(infos)
//            }else {
//                infos.add(new NonContent(nonContent: "non_content"))
//                it.setInfos(infos)
//            }
//        }
//        return todos;
//    }

}
