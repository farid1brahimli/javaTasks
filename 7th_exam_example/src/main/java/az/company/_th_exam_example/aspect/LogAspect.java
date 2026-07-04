package az.company._th_exam_example.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;

@Aspect
@Component
@Slf4j
public class LogAspect {
    @Around("within(az.company.seven_th_exam_example.service..*)" || "within(az.company.seven_th_exam_example.controller..*)")
    public void logMethodExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

    }
}
