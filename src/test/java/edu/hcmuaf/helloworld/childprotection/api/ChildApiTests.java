package edu.hcmuaf.helloworld.childprotection.api;

import edu.hcmuaf.helloworld.childprotection.model.Child;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ChildApiTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void createChildTestWithValidValue() throws Exception {
        this.mvc.perform(post("/child")
                .contentType(MediaType.APPLICATION_JSON)
                .requestAttr("obj", new Child()))
                .andExpect(status().isOk())
                .andExpect(content().json(""));
    }

    @Test
    public void readChildTestWithValidValue() throws Exception {
        this.mvc.perform(get("/child")
                .param("id", ""))
                .andExpect(status().isOk());
    }
}
