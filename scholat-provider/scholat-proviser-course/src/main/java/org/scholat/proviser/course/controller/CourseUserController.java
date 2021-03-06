package org.scholat.proviser.course.controller;


import lombok.extern.slf4j.Slf4j;
import org.scholat.common.ResultMsg;
import org.scholat.common.message.enums.CommonEnum;
import org.scholat.common.pojo.CourseUserInfo;
import org.scholat.proviser.course.entity.CourseUser;
import org.scholat.proviser.course.service.CourseUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course-api")
@Slf4j
public class CourseUserController {

    @Autowired
    private CourseUserService courseUserService;

    @PutMapping(value = "/join")
    public ResultMsg<Object> joinCourse(@RequestBody CourseUserInfo courseUser){
        log.info("course服务，接收参数CourseUser======>{}",courseUser);

        CourseUser course = new CourseUser();
        BeanUtils.copyProperties(courseUser,course);
        int m = courseUserService.joinCourse(course);
        if(m==1){
            return new ResultMsg<>(CommonEnum.SUCCESS,null);
        }
        return new ResultMsg<>(CommonEnum.UNKONW_ERROR,null);
    }


    @GetMapping("/all/course/{courseId}")
    public List<CourseUser> findAllCourseUserByCourseId(@PathVariable Integer courseId){
        log.info("[课程微服务] findAllCourseUserByCourseId  ====>courseId={}",courseId);
      return  courseUserService.findAllCourseUserByCourseId(courseId);
    }




}


