@Aspect
@Component
public class LogAspect {

    @Before("execution(* com.exemplo.service.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Método " + joinPoint.getSignature().getName() + " está sendo chamado...");
    }
    
    @After("execution(* com.exemplo.service.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Método " + joinPoint.getSignature().getName() + " foi executado.");
    }
}
