package xxl_job.task.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @className DemoJob
 * @author bangmin.mai
 * @description xxlJob  Demo
 * @updateTime 2021/10/22 23:24
 * @version 1.0
 */
@Component
// @JobHandler("demoJob") xxlJob 2.2 之前该注解是配置在类上
public class DemoJob extends IJobHandler {

    private Logger logger = LoggerFactory.getLogger(DemoJob.class);

    // 该类型具有原子性，可兼容多线程并发场景
    private AtomicInteger counts = new AtomicInteger();
    /**
     * @className DemoJob
     * @author bangmin.mai
     * @description 模拟业务代码
     * @updateTime 2021/10/22 23:25
     * @return: com.xxl.job.core.biz.model.ReturnT<java.lang.String>
     * @version 1.0
     */

    /*
        execute(String param) 方法的方法参数
        为调度中心的控制台中，新增任务时，配置的“任务参数”。一般情况下，不会使用到。
     */
    @Override
    @XxlJob(value = "demoJob") // xxlJob 2.2版本后 配置在方法上
    public ReturnT<String> execute(String s) throws Exception {
        // 打印日志
        logger.info("[execute][定时第 ({}) 次执行]", counts.incrementAndGet());
        return ReturnT.SUCCESS;
    }
}
