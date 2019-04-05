package com.asadkhan.base_module

import com.asadkhan.global.Constants.answerToEverything

object BaseConstant {
  
  private const val CONSTANT_NUMBER = 42
  
  fun isAnswerRight(): Boolean {
    return answerToEverything() == CONSTANT_NUMBER
  }
  
}
