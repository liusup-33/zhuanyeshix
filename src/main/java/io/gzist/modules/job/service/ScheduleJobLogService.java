
package io.gzist.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.gzist.common.utils.PageUtils;
import io.gzist.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
