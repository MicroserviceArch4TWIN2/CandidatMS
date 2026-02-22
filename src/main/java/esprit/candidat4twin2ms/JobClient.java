package esprit.candidat4twin2ms;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name="JobMs" , configuration = FeignConfig.class)
public interface JobClient {

    @RequestMapping("/jobs")
    public List<Job> getAllJobs();
    @RequestMapping("/jobs/{id}")
    public Job getJob(@PathVariable int id);
}
