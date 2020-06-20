package org.scholat.privider.task.studentHomeWork.service;

import org.scholat.common.pojo.CourseTask;

/**
 * @author yrk
 * @date 2020/6/17 - 16:32
 */
public interface IQueryCourseTaskService {

    //查询作业要求
    CourseTask queryCourseTaskByCourseIdAndTaskId (int courseId, int taskId);
}
