#import "ASTouchGestureRecognizer.h"

@implementation ASTouchGestureRecognizer

- (void)touchesBegan:(NSSet<UITouch *> *)touches
           withEvent:(UIEvent *)event {

    self.activeTouch = touches.anyObject;
    self.state = UIGestureRecognizerStateBegan;
}

- (void)touchesMoved:(NSSet<UITouch *> *)touches
           withEvent:(UIEvent *)event {

    self.state = UIGestureRecognizerStateChanged;
}

- (void)touchesEnded:(NSSet<UITouch *> *)touches
           withEvent:(UIEvent *)event {

    self.state = UIGestureRecognizerStateEnded;
}

- (void)touchesCancelled:(NSSet<UITouch *> *)touches
               withEvent:(UIEvent *)event {

    self.state = UIGestureRecognizerStateCancelled;
}

- (void)reset {

    self.activeTouch = nil;
}

@end