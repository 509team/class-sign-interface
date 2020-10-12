package cn.fzn.classsign.teacher.service;

import cn.fzn.classsign.common.service.ClassFeignService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "SERVICE-PROVIDER",contextId = "classService")
public interface ClassFeignClientService extends ClassFeignService {
}
