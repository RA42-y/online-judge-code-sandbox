package com.ra.onlinejudgecodesandbox;


import com.ra.onlinejudgecodesandbox.model.ExecuteCodeRequest;
import com.ra.onlinejudgecodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
